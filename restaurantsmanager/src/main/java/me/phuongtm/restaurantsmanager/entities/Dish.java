package me.phuongtm.restaurantsmanager.entities;

public class Dish {

    private int id;
    private String name;
    private String metaData;

    private Dish(int id, String name, String metaData) {
        this.id = id;
        this.name = name;
        this.metaData = metaData;
    }

    public static class Builder {

        private int id;
        private String name;
        private String metaData;

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }

        public Dish build() {
            return new Dish(id, name, metaData);
        }

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dish{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", metaData='").append(metaData).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
