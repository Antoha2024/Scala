FROM hseeberger/scala-sbt:11.0.14.1_1.6.2_2.12.15

WORKDIR /app
COPY . /app

RUN sbt update

CMD ["sbt", "test"]