package com.humeyra.calorietracker.ai.nutrition;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MacroDistribution {

    private int proteinGrams;
    private int carbGrams;
    private int fatGrams;
}
