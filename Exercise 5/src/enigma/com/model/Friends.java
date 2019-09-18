package enigma.com.model;

import java.util.Objects;

public class Friends {
    public String teman;

    public Friends(String teman){
        this.teman = teman;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friends friends = (Friends) o;
        return Objects.equals(teman, friends.teman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teman);
    }

    public String getTeman() {
        return teman;
    }

    public void setTeman(String teman) {
        this.teman = teman;
    }
}

