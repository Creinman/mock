import java.util.*;

import org.graalvm.compiler.debug.Assertions;
import ru.netology.*;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.graalvm.compiler.debug.Assertions;
import ru.netology.entity.Country;
import ru.netology.sender.MessageSenderImpl;

public class MessageSenderImplMock implements MessageSenderImpl {

        @Test
        void test_get_advice_in_bad_weather() {
            MessageSenderImpl messageSenderImpl = Mockito.mock(messageSenderImpl.class);
            Mockito.when(messageSenderImpl.locale(Country.USA))
                    .thenReturn(MessageSenderImpl.USA);
            MessageSenderImpl = Mockito.mock(MessageSenderImpl.class);
            Mockito.when(MessageSenderImpl.getCountry("RUSSIA"))
                    .thenReturn(MessageSenderImpl.RUSSIA);

            Assertions.assertEquals(geoService.locale(Country.USA), "USA");
            Assertions.assertEquals(geoService.locale(Country.RUSSIA), "RUSSIA");
        }
    }