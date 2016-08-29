import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String email;
	public int id;
	public CreatorModel _creator;
	public String privacy;
	public String schedule_published_on;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String end_time;
	public String topic;
	public String logo;
	public String organizer_description;
	public String state;
	public String timezone;
	public String name;
	public String background_image;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;

	public RootModel(VersionModel version, String email, int id, CreatorModel creator, String privacy, String schedule_published_on, String organizer_name, CopyrightModel copyright, String type, String description, Call_for_papersModel call_for_papers, String location_name, String end_time, String topic, String logo, String organizer_description, String state, String timezone, String name, String background_image, String start_time, ArrayList<Social_linksModel> social_links, String code_of_conduct) {

		this._version = version;
		this.email = email;
		this.id = id;
		this._creator = creator;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.end_time = end_time;
		this.topic = topic;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this.name = name;
		this.background_image = background_image;
		this.start_time = start_time;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;

	}

}