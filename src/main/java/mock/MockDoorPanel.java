package mock;

public class MockDoorPanel extends DoorPanel {
    @Override
    public void close() {
        System.out.println("Mock Door Panel close method is called ");
    }
}
