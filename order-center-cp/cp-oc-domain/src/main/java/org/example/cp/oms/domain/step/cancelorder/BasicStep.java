package org.example.cp.oms.domain.step.cancelorder;

import lombok.extern.slf4j.Slf4j;
import org.example.cp.oms.spec.exception.OrderException;
import org.example.cp.oms.domain.model.OrderModel;
import org.example.cp.oms.domain.step.CancelOrderStep;
import org.example.cp.oms.spec.Steps;
import io.github.dddplus.annotation.Step;

import javax.validation.constraints.NotNull;

@Step(value = "cancelBasicStep")
@Slf4j
public class BasicStep extends CancelOrderStep {

    @Override
    public void execute(@NotNull OrderModel model) throws OrderException {

    }

    @Override
    public String stepCode() {
        return Steps.CancelOrder.BasicStep;
    }
}
