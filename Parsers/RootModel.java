import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public int id;
	public String schedule_published_on;
	public String organizer_description;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String topic;
	public String logo;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;
	public String end_time;
	public String description;
	public String background_image;
	public String state;
	public CopyrightModel _copyright;
	public String start_time;
	public CreatorModel _creator;
	public String organizer_name;
	public String type;
	public String location_name;

	public RootModel(Call_for_papersModel call_for_papers, int id, String schedule_published_on, String organizer_description, String email, ArrayList<Social_linksModel> social_links, String timezone, String topic, String logo, String privacy, String name, String code_of_conduct, VersionModel version, String end_time, String description, String background_image, String state, CopyrightModel copyright, String start_time, CreatorModel creator, String organizer_name, String type, String location_name) {

		this._call_for_papers = call_for_papers;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.email = email;
		this.social_links = social_links;
		this.timezone = timezone;
		this.topic = topic;
		this.logo = logo;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.end_time = end_time;
		this.description = description;
		this.background_image = background_image;
		this.state = state;
		this._copyright = copyright;
		this.start_time = start_time;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.type = type;
		this.location_name = location_name;

	}

}