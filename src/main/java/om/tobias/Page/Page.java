package om.tobias.Page;


import org.jsoup.nodes.Document;


public class Page {

    private byte[] content;
    private String html;
    private Document doc;
    private String charset;
    private String url;
    private String contentType;


    public Page(byte[] content, String url, String contentType) {
        this.content = content;
        this.url = url;
        this.contentType = contentType;

    }

    public String getCharset() {
        return charset;
    }

    public byte[] getContent() {
        return content;
    }


    public String getContentType() {
        return contentType;
    }

    public String getUrl() {
        return url;
    }


    public String getHtml() {

        if (html != null) {
            return html;
        }

        if (content == null) {
            return null;
        }

        if (charset == null) {
            charset = CharsetDetector.
        }

    }

}
