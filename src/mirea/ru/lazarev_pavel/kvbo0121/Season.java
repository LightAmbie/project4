package mirea.ru.lazarev_pavel.kvbo0121;

public enum Season {
    AUTUMN(8.0), WINTER(-28.2), SPRING(5.0),
    SUMMER(17.0){
        @Override
        public String getDescription(){
            return "Warm season";
        }
    };

    private double tempature;

    Season(double tempature){
        this.tempature = tempature;
    }

    String getDescription(){
        return "Cold season";
    }
}
