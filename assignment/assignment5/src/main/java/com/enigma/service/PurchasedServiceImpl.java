package com.enigma.service;

import com.enigma.entities.Member;
import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.entities.PurchasedDetail;
import com.enigma.repositories.PurchasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PurchasedServiceImpl implements PurchasedService{
    @Autowired
    PurchasedRepository purchasedRepository;

    @Autowired
    ProductService productService;

    @Autowired
    MemberService memberService;

    @Override
    public Purchased purchasing(Purchased purchased) {
        Member member = memberService.getMember(purchased.getIdMember());
        purchased.setMember(member);
        BigDecimal sum = new BigDecimal(0);
        for (PurchasedDetail purchasedDetail: purchased.getPurchasedDetails()){
            Product product = productService.getProduct(purchasedDetail.getIdProduct());
            purchasedDetail.setSubTotal(product.getPrice().multiply(new BigDecimal(purchasedDetail.getQuantity())));
            purchasedDetail.setProduct(product);
            purchasedDetail.setPurchased(purchased);
            productService.deduct(purchasedDetail.getIdProduct(), purchasedDetail.getQuantity());
            sum = sum.add(purchasedDetail.getSubTotal());
        }
        purchased.setTotal(sum);
        return purchasedRepository.save(purchased);
    }

    @Override
    public List<Purchased> getAll() {
        return purchasedRepository.findAll();
    }

    @Override
    public void deletePurchased(String idPurchased) {
        purchasedRepository.deleteById(idPurchased);
    }

    //subresources
    @Override
    public List<Purchased> getPurchasedByMemberId(String idMember) {
        Member member = memberService.getMember(idMember);
        return member.getPurchaseds();
    }

//    @Override
//    public Member getPurchasedByMemberId(String idMember, Purchased purchased) {
//        Member member = memberService.getMember(idMember);
//        purchased.setMember(member);
//        return memberService.save(purchased);
//    }




}
