import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.caomt.noxmlweb.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;


public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
    HomeController controller = new HomeController();
    MockMvc mockMvc = standaloneSetup(controller).build();
    System.out.println(view().name("home"));
    mockMvc.perform(get("/aaa"))
           .andExpect(view().name("home"));
  }

}
