# Oh My ZSH

Once cloned the oh-my-zsh into your local .dotfiles folder

Perform install of zsh
```
$ sudo apt install zsh
```

make the sh scripts in tools directory executable:
```
$ find /{user}/.dotfiles/oh-my-zsh/tools -type f -iname "*.sh" -exec chmod +x {} \;
```

Copy this .zshrc file to your home directory
```
$ cp /{user}/.dotfiles/oh-my-zsh/.zshrc ~/.zshrc
```
