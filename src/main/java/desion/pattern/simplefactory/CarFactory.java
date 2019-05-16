package desion.pattern.simplefactory;

public class CarFactory {

    public static  Car carFactory(Class carClass) {
        try {
            return (Car) Class.forName(carClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
