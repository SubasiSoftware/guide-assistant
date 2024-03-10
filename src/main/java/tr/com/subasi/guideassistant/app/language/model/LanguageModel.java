package tr.com.subasi.guideassistant.app.language.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LanguageModel extends IdModel {

    @NotBlank
    private String code;
    @NotBlank
    private String name;
    private Boolean active = Boolean.TRUE;

}
