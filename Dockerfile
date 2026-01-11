FROM nginx:alpine

# Remove default HTML (optional, keeps image clean)
RUN rm -rf /usr/share/nginx/html/*

# Expose HTTP port
EXPOSE 80

# Run nginx in foreground
CMD ["nginx", "-g", "daemon off;"]
