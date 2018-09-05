package cl.bennu.springbootlabs2.domain;

public class Data {

    private String host;
    private String ip;
    private String agent;
    private String message;

    @Override
    public String toString() {
        return "Data{" +
                "host='" + host + '\'' +
                ", ip='" + ip + '\'' +
                ", agent='" + agent + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
