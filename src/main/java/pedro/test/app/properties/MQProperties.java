package pedro.test.app.properties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Entity
@Configuration
@PropertySource("file:/opt/openshift/properties/mq.properties")
public class MQProperties {

	@Id
	@GeneratedValue
	private long id;
	
	
	@Value("${channel}")
	private String channel;
	@Value("${hostName}")
	private String hostName;
	@Value("${location}")
	private String location;
	@Value("${name}")
	private String name;
	@Value("${port}")
	private String port;
	@Value("${receiverQueue}")
	private String receiverQueue;
	@Value("${senderQueue}")
	private String senderQueue;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getReceiverQueue() {
		return receiverQueue;
	}

	public void setReceiverQueue(String receiverQueue) {
		this.receiverQueue = receiverQueue;
	}

	public String getSenderQueue() {
		return senderQueue;
	}

	public void setSenderQueue(String senderQueue) {
		this.senderQueue = senderQueue;
	}

	public String toString() {
		return "MQManagerServiceInfo [name=" + name + ", hostName=" + hostName + ", channel=" + channel + ", port="
				+ port + ", location=" + location + ", senderQueue=" + senderQueue + ", receiverQueue=" + receiverQueue
				+ "]";
	}

}
