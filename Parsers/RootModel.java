import java.util.ArrayList;

class RootModel {

	public int id;
	public String background_image;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String schedule_published_on;
	public String privacy;
	public String email;
	public String logo;
	public String end_time;
	public String description;
	public VersionModel _version;
	public String topic;
	public String timezone;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_name;
	public CreatorModel _creator;
	public String name;
	public String location_name;
	public String type;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(int id, String background_image, String start_time, Call_for_papersModel call_for_papers, String state, String schedule_published_on, String privacy, String email, String logo, String end_time, String description, VersionModel version, String topic, String timezone, String code_of_conduct, CopyrightModel copyright, String organizer_name, CreatorModel creator, String name, String location_name, String type, String organizer_description, ArrayList<Social_linksModel> social_links) {

		this.id = id;
		this.background_image = background_image;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.email = email;
		this.logo = logo;
		this.end_time = end_time;
		this.description = description;
		this._version = version;
		this.topic = topic;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.name = name;
		this.location_name = location_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.social_links = social_links;

	}

}