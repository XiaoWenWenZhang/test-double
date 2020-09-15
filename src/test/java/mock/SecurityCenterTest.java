package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecurityCenterTest {

    private SecurityCenter securityCenter;
    private MockDoorPanel mockDoorPanel;

    @BeforeEach
    public void setUp() {
        mockDoorPanel = new MockDoorPanel();
        securityCenter = new SecurityCenter(mockDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
    }
}
