def call(String projectName,String dockerHubUser, String imageTag){
echo "this is building the code"
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
