package enumaration;

public enum AdvancedPriorityEnum {
    LOW(7), MEDIUM(5), HIGH(2), URGENT(1);

    private int estimatedCompletion;

    AdvancedPriorityEnum(int estimatedCompletionDays) {
        this.estimatedCompletion = estimatedCompletionDays;

    }

    public int getEstimatedCompletionDays() {
        return (estimatedCompletion);
    }
}
