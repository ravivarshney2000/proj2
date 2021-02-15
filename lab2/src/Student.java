public class Student implements Comparable {
    private int rollNo;
    private String name;

    //getter
    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    //setter
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "rollNo=" + rollNo +
                ", name='" + name ;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){

        }
    }
}
