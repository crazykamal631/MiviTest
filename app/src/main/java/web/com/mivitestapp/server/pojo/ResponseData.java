package web.com.mivitestapp.server.pojo;

public class ResponseData {
    private ResponseDataRelationships relationships;
    private ResponseDataAttributes attributes;
    private ResponseDataLinks links;
    private String id;
    private String type;

    public ResponseDataRelationships getRelationships() {
        return this.relationships;
    }

    public void setRelationships(ResponseDataRelationships relationships) {
        this.relationships = relationships;
    }

    public ResponseDataAttributes getAttributes() {
        return this.attributes;
    }

    public void setAttributes(ResponseDataAttributes attributes) {
        this.attributes = attributes;
    }

    public ResponseDataLinks getLinks() {
        return this.links;
    }

    public void setLinks(ResponseDataLinks links) {
        this.links = links;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
