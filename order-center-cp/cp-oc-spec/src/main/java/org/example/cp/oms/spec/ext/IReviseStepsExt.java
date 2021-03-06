package org.example.cp.oms.spec.ext;

import org.example.cp.oms.spec.model.IOrderModel;
import io.github.dddplus.ext.IDomainExtension;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface IReviseStepsExt extends IDomainExtension {

    List<String> reviseSteps(@NotNull IOrderModel model);

}
