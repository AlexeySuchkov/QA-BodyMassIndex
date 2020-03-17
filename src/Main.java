public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        int weight = 95;
        int height = 182;
        int miles = service.calculate(weight, height);
        System.out.println(miles);
    }
}
