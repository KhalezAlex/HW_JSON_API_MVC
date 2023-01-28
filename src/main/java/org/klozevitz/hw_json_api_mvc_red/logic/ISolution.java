package org.klozevitz.hw_json_api_mvc.logic;

import org.springframework.stereotype.Component;

@Component
public interface ISolution {
    Object answer(String operation, LinearOperator lo1, LinearOperator lo2);
}
