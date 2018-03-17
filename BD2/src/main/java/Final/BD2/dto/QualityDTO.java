package Final.BD2.dto;

import java.util.Collection;
import java.util.HashSet;


public class QualityDTO {
	private long qualityID;
	private String description;
	private Collection<VideoDTO> videos;

	public QualityDTO() {

	}

	public QualityDTO(long id, String aDescription) {
		this.description = aDescription;
		this.videos = new HashSet<VideoDTO>();
		this.qualityID=id;
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

	public Collection<VideoDTO> getVideos() {
		return videos;
	}

	public void setVideos(Collection<VideoDTO> videos) {
		this.videos = videos;
	}

}
