package web.com.mivitestapp.server.pojo;

public class Response {
    private ResponseData data;
    private ResponseIncluded[] included;

    public ResponseData getData() {
        return this.data;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }

    public ResponseIncluded[] getIncluded() {
        return this.included;
    }

    public void setIncluded(ResponseIncluded[] included) {
        this.included = included;
    }
}
