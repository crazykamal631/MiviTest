package web.com.mivitestapp.server.pojo;

public class ResponseIncludedRelationshipsSubscriptions {
    private ResponseIncludedRelationshipsSubscriptionsData[] data;
    private ResponseIncludedRelationshipsSubscriptionsLinks links;

    public ResponseIncludedRelationshipsSubscriptionsData[] getData() {
        return this.data;
    }

    public void setData(ResponseIncludedRelationshipsSubscriptionsData[] data) {
        this.data = data;
    }

    public ResponseIncludedRelationshipsSubscriptionsLinks getLinks() {
        return this.links;
    }

    public void setLinks(ResponseIncludedRelationshipsSubscriptionsLinks links) {
        this.links = links;
    }
}
