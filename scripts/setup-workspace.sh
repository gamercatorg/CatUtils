git remote add lab https://l-bot:1yfM4rwxUz4kx5szA6yV@gitlab.com/gamer4life1/catutils.git
git pull
git pull lab master
npm install -g jfrog-cli-go
gpg --import private.asc
git config --global user.signingkey 76C07A52ECF60538
git config --global commit.gpgsign true
export GPG_TTY=$(tty)
export MVN_CLI_OPTS="-s .m2/settings.xml --batch-mode -Dsettings.security=.m2/settings-security.xml"
gpg --send-keys 76B303AF7A92D4EE8061CD0376C07A52ECF60538
gpg --keyserver http://keyserver.ubuntu.com:11371 --send-keys 76B303AF7A92D4EE8061CD0376C07A52ECF60538
gpg --keyserver http://keyserver.ubuntu.com --send-keys 76B303AF7A92D4EE8061CD0376C07A52ECF60538