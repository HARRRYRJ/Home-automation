import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_name;
	public String type;
	public String state;
	public String topic;
	public String location_name;
	public String organizer_description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public int id;
	public CopyrightModel _copyright;
	public String background_image;
	public String description;
	public String schedule_published_on;
	public String code_of_conduct;
	public String start_time;
	public VersionModel _version;
	public String name;
	public String end_time;
	public String logo;
	public String privacy;

	public RootModel(Call_for_papersModel call_for_papers, String email, String organizer_name, String type, String state, String topic, String location_name, String organizer_description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String timezone, int id, CopyrightModel copyright, String background_image, String description, String schedule_published_on, String code_of_conduct, String start_time, VersionModel version, String name, String end_time, String logo, String privacy) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_name = organizer_name;
		this.type = type;
		this.state = state;
		this.topic = topic;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.social_links = social_links;
		this.timezone = timezone;
		this.id = id;
		this._copyright = copyright;
		this.background_image = background_image;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._version = version;
		this.name = name;
		this.end_time = end_time;
		this.logo = logo;
		this.privacy = privacy;

	}

}