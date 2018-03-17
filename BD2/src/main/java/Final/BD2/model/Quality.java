package Final.BD2.model;

import java.util.Collection;
import java.util.HashSet;

public class Quality {
	private long qualityID;
	private String description;
	private Collection<Video> videos;
	
	public Quality() {
		
	}

	public Quality (String aDescription) {
		this.description = aDescription;
		this.videos = new HashSet<Video>();
	}

	public long getQualityID() {
		return qualityID;
	}

	public void setQualityID(long qualityId) {
		this.qualityID = qualityId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Video> getVideos() {
		return videos;
	}

	public void setVideos(Collection<Video> videos) {
		this.videos = videos;
	}

	
}
