import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String schedule_published_on;
	public String privacy;
	public CreatorModel _creator;
	public String start_time;
	public String location_name;
	public String state;
	public String email;
	public String end_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_description;
	public String topic;
	public String name;
	public VersionModel _version;
	public String description;
	public String background_image;
	public String logo;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;

	public RootModel(Call_for_papersModel call_for_papers, String code_of_conduct, String schedule_published_on, String privacy, CreatorModel creator, String start_time, String location_name, String state, String email, String end_time, String organizer_name, CopyrightModel copyright, String type, String organizer_description, String topic, String name, VersionModel version, String description, String background_image, String logo, int id, ArrayList<Social_linksModel> social_links, String timezone) {

		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._creator = creator;
		this.start_time = start_time;
		this.location_name = location_name;
		this.state = state;
		this.email = email;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.name = name;
		this._version = version;
		this.description = description;
		this.background_image = background_image;
		this.logo = logo;
		this.id = id;
		this.social_links = social_links;
		this.timezone = timezone;

	}

}