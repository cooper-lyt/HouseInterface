package cc.coopersoft.house.sale.data;

/**
 * Created by cooper on 04/08/2017.
 */
public class SubmitResult {

    public enum SubmitStatus {
        SUCCESS, FAIL, ERROR
    }

    public SubmitResult() {
    }

    public SubmitResult(SubmitStatus status, String messages) {
        this.status = status;
        this.messages = messages;
    }



    private SubmitStatus status;

    private String messages;

    private String businessId;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public SubmitStatus getStatus() {
        return status;
    }

    public void setStatus(SubmitStatus status) {
        this.status = status;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
