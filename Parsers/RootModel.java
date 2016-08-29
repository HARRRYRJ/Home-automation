import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String schedule_published_on;
	public String code_of_conduct;
	public int id;
	public String name;
	public String organizer_name;
	public VersionModel _version;
	public String timezone;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String start_time;
	public String privacy;
	public String state;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String description;
	public String background_image;
	public String type;
	public String email;

	public RootModel(CreatorModel creator, String schedule_published_on, String code_of_conduct, int id, String name, String organizer_name, VersionModel version, String timezone, String topic, ArrayList<Social_linksModel> social_links, String end_time, String start_time, String privacy, String state, CopyrightModel copyright, String organizer_description, String location_name, Call_for_papersModel call_for_papers, String logo, String description, String background_image, String type, String email) {

		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.name = name;
		this.organizer_name = organizer_name;
		this._version = version;
		this.timezone = timezone;
		this.topic = topic;
		this.social_links = social_links;
		this.end_time = end_time;
		this.start_time = start_time;
		this.privacy = privacy;
		this.state = state;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this.type = type;
		this.email = email;

	}

}