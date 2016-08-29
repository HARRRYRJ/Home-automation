import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String email;
	public VersionModel _version;
	public String organizer_description;
	public String code_of_conduct;
	public String background_image;
	public String state;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String logo;
	public String start_time;
	public String name;
	public String end_time;
	public String location_name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String description;
	public String timezone;
	public String privacy;
	public String topic;

	public RootModel(CreatorModel creator, String email, VersionModel version, String organizer_description, String code_of_conduct, String background_image, String state, CopyrightModel copyright, String schedule_published_on, String logo, String start_time, String name, String end_time, String location_name, int id, Call_for_papersModel call_for_papers, String organizer_name, ArrayList<Social_linksModel> social_links, String type, String description, String timezone, String privacy, String topic) {

		this._creator = creator;
		this.email = email;
		this._version = version;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.state = state;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.start_time = start_time;
		this.name = name;
		this.end_time = end_time;
		this.location_name = location_name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.type = type;
		this.description = description;
		this.timezone = timezone;
		this.privacy = privacy;
		this.topic = topic;

	}

}