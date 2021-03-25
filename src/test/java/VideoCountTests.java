import assignment1.HtmlGrabber;
import assignment1.metrics.VideoCountProvider;
import org.junit.jupiter.api.BeforeEach;

public class VideoCountTests {

    // TODO: refactor tests to be beautiful

    HtmlGrabber grabber;
    VideoCountProvider vcp;
    final String URL_NGINX_DEFAULT_PAGE = "https://www.youtube.com/watch?v=h-cmtfDax0g";

    @BeforeEach
    void setupValidGrabber() {
        instantiateObjectsByUrl(URL_NGINX_DEFAULT_PAGE);
    }

    private void instantiateObjectsByUrl(String url) {
        grabber = new HtmlGrabber(url);
        vcp = new VideoCountProvider(grabber);
    }

    // TODO: define tests

}
