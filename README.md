# Wader
A very simple Minecraft mod that does one thing: it prevents fluid from being
able to push players around.

It does so by changing the `Player.isPushedByFluid()` getter to always
return `false`. That's it. That's the mod.

### But why?
I made this mod for use in a private modpack, in combination with the
[flowing fluids](https://modrinth.com/mod/flowing-fluids) mod which creates
all kinds of streams and currents even when the water is visually settled.
This means wading through standing water becomes incredibly annoying, especially
while exploring caves.
