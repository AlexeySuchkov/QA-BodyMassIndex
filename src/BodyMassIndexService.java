public class BodyMassIndexService {
    public int calculate(int weight, int height) {
        int bmi = weight / ((height/100)^2);
        return bmi;
    }
}
