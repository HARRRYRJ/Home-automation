import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String name;
	public String logo;
	public String end_time;
	public String timezone;
	public String organizer_description;
	public String privacy;
	public String start_time;
	public String email;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String background_image;
	public String state;
	public String organizer_name;
	public String type;
	public String description;

	public RootModel(CreatorModel creator, String name, String logo, String end_time, String timezone, String organizer_description, String privacy, String start_time, String email, VersionModel version, CopyrightModel copyright, String schedule_published_on, String location_name, Call_for_papersModel call_for_papers, String code_of_conduct, String topic, ArrayList<Social_linksModel> social_links, int id, String background_image, String state, String organizer_name, String type, String description) {

		this._creator = creator;
		this.name = name;
		this.logo = logo;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.email = email;
		this._version = version;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.social_links = social_links;
		this.id = id;
		this.background_image = background_image;
		this.state = state;
		this.organizer_name = organizer_name;
		this.type = type;
		this.description = description;

	}

}