# Oh My ZSH

In order for Oh-My-Zsh to work, Zsh must be installed.
Please run
```
$ zsh --version to confirm.
```
Expected result: zsh 5.1.1 or more recent

Please run
```
$ echo $SHELL from a new terminal to confirm.
```
Expected result: usr/bin/zsh or similar

Set up zsh as default
Make it your default shell: 
```
$ chsh -s $(which zsh)
```
Note that this will not work if Zsh is not in your authorized shells list (/etc/shells) or if you don't have permission to use chsh. If that's the case you'll need to use a different procedure.
Log out and login back again to use your new default shell.

Test that it worked with
```
$ echo $SHELL
```
Expected result: /bin/zsh or similar.


# !Once cloned the oh-my-zsh into your local .dotfiles folder!


Perform install of zsh
```
$ sudo apt install zsh
```

make the sh scripts in tools directory executable:
```
$ find /{user}/.dotfiles/oh-my-zsh/tools -type f -iname "*.sh" -exec chmod +x {} \;
```

# for Spaceship theme:

Clone this repo:

```
git clone https://github.com/denysdovhan/spaceship-prompt.git "$ZSH_CUSTOM/themes/spaceship-prompt"
```

Symlink spaceship.zsh-theme to your oh-my-zsh custom themes directory:

```
ln -s "$ZSH_CUSTOM/themes/spaceship-prompt/spaceship.zsh-theme" "$ZSH_CUSTOM/themes/spaceship.zsh-theme"
```

# Finally

Copy this .zshrc file to your home directory
```
$ cp /{user}/.dotfiles/oh-my-zsh/.zshrc ~/.zshrc
```