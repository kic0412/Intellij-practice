package ch04;

class Phone {

    String model;
    int value;

    void print() {
        System.out.println(value + " 만원 " + model + " 스마트폰 ");
    }
}


public class PhoneDemo {
    public static void main(String[] args) {
        Phone myphone = new Phone();
        myphone.model = "Gal 2023";
        myphone.value = 100;
        myphone.print();

        Phone yourphone = new Phone();
        yourphone.model = "iphone";
        yourphone.value = 85;
        yourphone.print();
    }

}
