public enum PlaneType {


    BOEING747(20, 400, 25),
    BOEING707(10, 300, 25);


    private final int capacity;
    private final int weight;
    private final int bagWeight;


    PlaneType(int capacity, int weight, int bagWeight){
        this.capacity = capacity;
        this.weight = weight;
        this.bagWeight = bagWeight;
    }



    public int planeCapacity() {
        return capacity;
    }


    public int planeWeight(){
        return weight;
        }


    public int planeBagWeight(){
        return this.bagWeight;}

}



