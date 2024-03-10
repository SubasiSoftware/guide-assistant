package tr.com.subasi.guideassistant.app.paymenttype.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PaymentTypeSearchModel extends BaseSearchModel {

    private String code;
    private String name;
    private Boolean active;

}



