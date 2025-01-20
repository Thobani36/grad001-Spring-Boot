

import com.enviro.assessment.grad001.ThobaniMabaso.controller.WasteCategoryController;
import com.enviro.assessment.grad001.ThobaniMabaso.model.WasteCategory;
import com.enviro.assessment.grad001.ThobaniMabaso.service.WasteCategoryService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class WasteCategoryControllerTest {

    @Mock
    private WasteCategoryService wasteCategoryService;

    @InjectMocks
    private WasteCategoryController wasteCategoryController;

    private MockMvc mockMvc;

    @Test
    public void testCreateCategory() throws Exception {
        WasteCategory category = new WasteCategory();
        category.setName("Plastic");
        category.setDescription("Plastic waste category");

        when(wasteCategoryService.saveCategory(any(WasteCategory.class))).thenReturn(category);

        mockMvc.perform(post("/api/waste-categories")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"Plastic\",\"description\":\"Plastic waste category\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("Plastic"));
    }
}
