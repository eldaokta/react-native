package com.enigma.model;

import java.util.List;

public interface CircleDao {
    public List<Circle> getAllCircle();
    public void update(Circle circle);
    public void delete(Circle circle);
}
