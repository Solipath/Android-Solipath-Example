# Solipath Android example project
Solipath is a tool that downloads and temporarily sets up environment variables for various programming languages and related tools

This is a quick showcase of using Solipath for an Android project
To run tests from the command line:
```bash
./solipath gradle build
./solipath gradle pixel2api30DebugAndroidTest
```

After you run your gradle build you will likely be asked to accept licenses before the build will succeed.
You can accept them using the following command, and following the prompts
```bash
./solipath sdkmanager --licenses
```

The solipath.json file in solipath_idea includes intellij community edition, 
so you can start it by running the following inside the solipath_idea directory
```bash
../solipath idea ..
```

If you have an existing android project, all you should need to do is copy the solipath, solipath.bat (once it is there), and the solipath.json files over to your project.

## Licensing
I threw on an MIT License on this project just because my understanding is that if it doesn't have some kind of license, it becomes impossible for people to use. Please let me know if there is anything I can do to make this easier!
