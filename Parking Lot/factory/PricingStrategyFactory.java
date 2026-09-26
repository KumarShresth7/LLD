package factory;
import enums.PricingStrategyType;
import strategy.pricing.*;


public class PricingStrategyFactory {
    public static PricingStrategy get(PricingStrategyType type){
        return switch (type) {
            case TIME_BASED -> new TimeBasedPricing();
            case EVENT_BASED -> new EventBasedPricing();
        };
    }
}