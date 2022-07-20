def buidApp() {
  echo 'Buiding application'
}
def testApp() {
  echo 'Testing application'
}
def depoyApp() {
  echo 'Buiding application'
  echo "deploying version ${param.VERSION}"
}

return this
