import java.util.Map;
import java.util.Set;

import org.graalvm.compiler.debug.Assertions;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.sender.MessageSenderImpl;

public class GeoServiceMock implements GeoService {

    @Test
    void test_get_advice_in_bad_weather() {
        GeoService geoService = Mockito.mock(GeoService.class);
        Mockito.when(geoService.locale(Country.USA))
                .thenReturn(GeoService.USA);
        GeoServiceMock = Mockito.mock(GeoService.class);
        Mockito.when(GeoService.getCountry("RUSSIA"))
                .thenReturn(GeoServiceMock.RUSSIA);
        Set<Preference> preferences = GeoService.getCountry("USA");
        Set<Preference> expected = GeoService.getCountry("USA");
        Assertions.assertEquals(expected, preferences);
    }
}

