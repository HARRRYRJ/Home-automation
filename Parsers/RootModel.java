import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String name;
	public String background_image;
	public String email;
	public String code_of_conduct;
	public String type;
	public String location_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String description;
	public String privacy;
	public String end_time;
	public String organizer_description;
	public String organizer_name;
	public String state;
	public String start_time;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String schedule_published_on;
	public String topic;

	public RootModel(CreatorModel creator, String name, String background_image, String email, String code_of_conduct, String type, String location_name, int id, ArrayList<Social_linksModel> social_links, String logo, String description, String privacy, String end_time, String organizer_description, String organizer_name, String state, String start_time, VersionModel version, CopyrightModel copyright, Call_for_papersModel call_for_papers, String timezone, String schedule_published_on, String topic) {

		this._creator = creator;
		this.name = name;
		this.background_image = background_image;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this.social_links = social_links;
		this.logo = logo;
		this.description = description;
		this.privacy = privacy;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.state = state;
		this.start_time = start_time;
		this._version = version;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;

	}

}