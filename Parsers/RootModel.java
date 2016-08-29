import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public VersionModel _version;
	public String name;
	public String state;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String logo;
	public String organizer_name;
	public String timezone;
	public String email;
	public String start_time;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String privacy;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String location_name;
	public int id;
	public String type;
	public String end_time;

	public RootModel(Call_for_papersModel call_for_papers, String schedule_published_on, VersionModel version, String name, String state, String topic, String code_of_conduct, String description, String logo, String organizer_name, String timezone, String email, String start_time, String organizer_description, CopyrightModel copyright, String privacy, CreatorModel creator, ArrayList<Social_linksModel> social_links, String background_image, String location_name, int id, String type, String end_time) {

		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.name = name;
		this.state = state;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.email = email;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.privacy = privacy;
		this._creator = creator;
		this.social_links = social_links;
		this.background_image = background_image;
		this.location_name = location_name;
		this.id = id;
		this.type = type;
		this.end_time = end_time;

	}

}