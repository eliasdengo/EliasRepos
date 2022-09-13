

#open()
# filename and mode
#mode a-append,w-write,r-read,x-create file,t-text,b-binary
fi = open("file.txt", 'rt')
print(fi.read())