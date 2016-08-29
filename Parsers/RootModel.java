import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public VersionModel _version;
	public String location_name;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public String start_time;
	public String email;
	public String topic;
	public String timezone;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String schedule_published_on;
	public String end_time;
	public String state;
	public int id;
	public String background_image;
	public String logo;
	public String type;

	public RootModel(CreatorModel creator, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String organizer_description, VersionModel version, String location_name, String privacy, String name, String code_of_conduct, String start_time, String email, String topic, String timezone, String description, Call_for_papersModel call_for_papers, String organizer_name, String schedule_published_on, String end_time, String state, int id, String background_image, String logo, String type) {

		this._creator = creator;
		this._copyright = copyright;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._version = version;
		this.location_name = location_name;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.email = email;
		this.topic = topic;
		this.timezone = timezone;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.state = state;
		this.id = id;
		this.background_image = background_image;
		this.logo = logo;
		this.type = type;

	}

}